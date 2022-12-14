package com.example.listviewpractice_zeeeni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_zeeeni.adapters.StudentAdapter
import com.example.listviewpractice_zeeeni.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("김지은", 1994))
        mStudentList.add( Student("김정은", 1997))
        mStudentList.add( Student("김예은", 2000))
        mStudentList.add( Student("김도환", 2006))
        mStudentList.add( Student("김호섭", 1966))
        mStudentList.add( Student("김춘화", 1972))
        mStudentList.add( Student("전한솔", 1994))


        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter



    }
}