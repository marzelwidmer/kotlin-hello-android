package ch.keepcalm.helloworld.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import ch.keepcalm.helloworld.R

 class MyCustomerAdapter(context: Context) : BaseAdapter() {
    private val mContext: Context

    private val names = arrayListOf<String>(
            "Donald Trump", "Steve Jobs", "Tim Cook", "Mark Zuckerberg", "Barack Obama"
    )

    init {
        mContext = context
    }

    // render each row
    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        val layoutInflater =  LayoutInflater.from(mContext)
        val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)
        val nameTextView = rowMain.findViewById<TextView>(R.id.name_textView)
        nameTextView.text = names.get(position)

        val positonTextView = rowMain.findViewById<TextView>(R.id.postition_textView)
        positonTextView.text = "Row number: $position"
        return rowMain
//            val textView = TextView(mContext)
//            textView.text = "Here is my Row for my ListView"
//            return  textView
    }

    override fun getItem(position: Int): Any {
        return "Test String"
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return names.size
    }

}
