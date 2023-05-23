package kr.hs.emirim.syhan.projecttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import com.google.android.material.checkbox.MaterialCheckBox.CheckedState

class MainActivity : AppCompatActivity() {
    lateinit var switchStart:Switch
    lateinit var rg:RadioGroup
    lateinit var linear:LinearLayout
    lateinit var endDone:Button
    lateinit var restartDone:Button
    lateinit var imgv:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchStart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        endDone = findViewById(R.id.end_done)
        restartDone = findViewById(R.id.end_done)
        imgv = findViewById(R.id.imgv)
        linear.visibility = View.INVISIBLE

        switchStart.setOnCheckedChangeListener{compoundButton, b ->
            if(switchStart.isChecked){
                linear.visibility = View.VISIBLE
            }
            else{
                linear.visibility = View.INVISIBLE
            }
        }

        rg.setOnCheckedChangeListener { radioGroup, i ->
            when(rg.checkedRadioButtonId){
                R.id.radio_dog -> imgv.setImageResource(R.drawable.dog)
                R.id.radio_rabbit -> imgv.setImageResource(R.drawable.rabbit)
                R.id.radio_cat -> imgv.setImageResource(R.drawable.cat)
            }
        }



    }
}