package jaypal.admin.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandedListViewActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> listDataHeader;
    HashMap<Integer,String> hm=new HashMap<Integer,String>();

    ArrayList listDataheader=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanded_list_view);
        expandableListView=findViewById(R.id.expandedListView);

    }
    private void prepareListData(){
        listDataheader=new ArrayList<String>();

        listDataheader.add("topics");
        listDataheader.add("Topicss Covered");
        listDataheader.add("Topicss Not Covered");
        listDataheader.add("Switch to startActivity for Result");
        listDataheader.add("Topicss Covered");
        listDataheader.add("Topicss Covered");

         //add items in Hash map
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");



    }
}
