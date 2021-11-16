#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

#parse("File Header.java")
class ${NAME}(context:Context, val items: List<${ITEM_CLASS}>?) : RecyclerView.Adapter<${VIEWHOLDER_CLASS}>() {
    override fun onBindViewHolder(holder: ${VIEWHOLDER_CLASS}, position: Int) {
        val item = items?.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${VIEWHOLDER_CLASS} {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.${LAYOUT_RES_ID}, parent, false)
        return ${VIEWHOLDER_CLASS}(v)
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0 
    } 
}
