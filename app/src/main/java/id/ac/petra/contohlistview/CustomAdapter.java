package id.ac.petra.contohlistview;


import android.content.Context;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<DataModel> implements View.OnClickListener {

    private ArrayList<DataModel> dataSet;
    Context mContext;

    private static class ViewHolder {
        TextView tvName;
        TextView tvType;
        TextView tvVersion;
    }

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context,R.layout.row_item,data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public void onClick(View view) {

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataModel dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;

        if (convertView==null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_item,parent,false);
            viewHolder.tvName = convertView.findViewById(R.id.nama);
            viewHolder.tvType = convertView.findViewById(R.id.type);
            viewHolder.tvVersion = convertView.findViewById(R.id.version);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        viewHolder.tvName.setText(dataModel.getName());
        viewHolder.tvType.setText(dataModel.getType());
        viewHolder.tvVersion.setText(dataModel.getVersion_number());

        return convertView;
    }
}
