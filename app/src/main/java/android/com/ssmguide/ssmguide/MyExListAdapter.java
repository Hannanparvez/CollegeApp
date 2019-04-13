package android.com.ssmguide.ssmguide;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyExListAdapter extends BaseExpandableListAdapter
{
    Context context;
    List<String>  sem;
    Map<String,List<String>> subjects;

    public MyExListAdapter(Context context, List<String> sem, Map<String, List<String>> subjects) {
        this.context = context;
        this.sem = sem;
        this.subjects = subjects;
    }

    @Override
    public int getGroupCount() {
        return sem.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return subjects.get(sem.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return sem.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return subjects.get(sem.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String sem= (String) getGroup(groupPosition);

        if(convertView == null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_parent,null);
        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.txtParent);
        txtParent.setText(sem);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String subjects = (String) getChild(groupPosition,childPosition);
        if(convertView == null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_child,null);
        }
        TextView txtChild = (TextView) convertView.findViewById(R.id.txtChild);
        Button bu=convertView.findViewById(R.id.button);
        txtChild.setText(subjects);
        bu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String servicestring = Context.DOWNLOAD_SERVICE;
                DownloadManager downloadmanager;
                downloadmanager = (DownloadManager) context.getSystemService(servicestring);
                Uri uri = Uri
                        .parse("https://firebasestorage.googleapis.com/v0/b/ssmguide-f06a4.appspot.com/o/You%20Are%20a%20Badass_%20How%20to%20Stop%20Doubting%20Your%20Greatness%20and%20Start%20Living%20an%20Awesome%20Life%20(%20PDFDrive.com%20).pdf?alt=media&token=370cecf9-c282-48e0-9048-32369d2fb941");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                Long reference = downloadmanager.enqueue(request);

            }

        });

        return convertView;


    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}

