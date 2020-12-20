package com.example.android.cardstack

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.facebook.drawee.view.SimpleDraweeView


@BindingAdapter("image")
fun loadImage(view: SimpleDraweeView, url: String) {
    view.setImageURI(url)
}

@BindingAdapter("android:text")
fun setText(view: TextView, text: CharSequence?) {
    // Some checks removed for clarity
    view.text = text
}