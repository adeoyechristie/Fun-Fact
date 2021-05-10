package com

import android.content.*
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.content.res.AssetManager
import android.content.res.Configuration
import android.content.res.Resources
import android.database.DatabaseErrorHandler
import android.database.sqlite.SQLiteDatabase
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.media.tv.TvContract
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.UserHandle
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.fun_fact.DetailActivity
import com.example.fun_fact.R
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStream

class FactAdapter(context: Context, facts: List<FactModel>): ArrayAdapter<FactModel>(context, 0, facts) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val fact = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.fact_item, parent, false)
        }
        val logo = view?.findViewById<ImageView>(R.id.imageLogo)
        val name = view?.findViewById<TextView>(R.id.nameTv)

        fact?.logo?.let {
            logo?.setImageResource(fact.logo)

        }

        name?.text = fact?.name
        view?.setOnClickListener {

            val intent = Intent(parent.context, DetailActivity::class.java)
            intent.putExtra(LOGO_EXTRAs, fact?.logo)
            intent.putExtra(NAME_EXTRAS, fact?.name)
            intent.putExtra(FACT_EXTRAS, fact?.fact)
            parent.context.startActivity(intent)
        }

        return view!!
      }
    companion object{
        val LOGO_EXTRAs = "logo_extras"
        val NAME_EXTRAS = "name_extras"
        val FACT_EXTRAS = "fact_extras"
    }
    }