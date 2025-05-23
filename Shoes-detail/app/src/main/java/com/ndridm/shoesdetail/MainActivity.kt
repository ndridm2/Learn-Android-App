package com.ndridm.shoesdetail

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import com.ndridm.shoesdetail.data.RemoteDataSource
import com.ndridm.shoesdetail.databinding.ActivityMainBinding
import com.ndridm.shoesdetail.model.ProductModel
import com.ndridm.shoesdetail.utils.withCurrencyFormat
import com.ndridm.shoesdetail.utils.withDateFormat
import com.ndridm.shoesdetail.utils.withNumberingFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
        setupAction()
        setupData()
    }

    private fun setupAction() {
        binding.cardView.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this, // context
                binding.cardView, // shared view
                "card_transition" // same transition name as in XML
            )

            startActivity(intent, options.toBundle())
        }
    }


    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        supportActionBar?.hide()
    }

    private fun setupData() {
        val data = RemoteDataSource(this)
        val product = data.getDetailProduct().apply {
            binding.apply {
                previewImageView.setImageResource(image)
                nameTextView.text = name
                storeTextView.text = store
                colorTextView.text = color
                sizeTextView.text = size
                priceTextView.text = price.withCurrencyFormat()
                dateTextView.text = getString(R.string.dateFormat, date.withDateFormat())
                ratingTextView.text = getString(
                    R.string.ratingFormat,
                    rating.withNumberingFormat(),
                    countRating.withNumberingFormat()
                )
            }
        }
        setupAccessibility(product)
    }

    private fun setupAccessibility(productModel: ProductModel) {
        productModel.apply {
            binding.apply {
                previewImageView.contentDescription = getString(R.string.previewDescription)
                colorTextView.contentDescription = getString(R.string.colorDescription, color)
                sizeTextView.contentDescription = getString(R.string.sizeDescription, size)
                ratingTextView.contentDescription = getString(
                    R.string.ratingDescription,
                    rating.withNumberingFormat(),
                    countRating.withNumberingFormat()
                )
            }
        }
    }
}