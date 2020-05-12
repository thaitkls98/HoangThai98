package vn.com.newsviet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import vn.com.newsviet.Utils.SourceData;
import vn.com.newsviet.adapter.ListSourceNewsAdapter;
import vn.com.newsviet.model.News;
import vn.com.newsviet.model.SourceNews;
import vn.com.newsviet.view.FontTextView;


public class ListSourceNewsActivity extends AppCompatActivity {
    ImageView imgback, img1;
    FontTextView titleheader;
    LinearLayout layout_header;
    RecyclerView recyclerview_listsourcenews;
    ArrayList<SourceNews> arrayListSourceNews = new ArrayList();
    ListSourceNewsAdapter listSourceNewsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_source_news);
        Anhxa();
        titleheader.setText("Trang báo");

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int heightscreen = displayMetrics.heightPixels;
        int widthscreen = displayMetrics.widthPixels;

        layout_header.measure(0, 0);
        int height_header = layout_header.getMeasuredHeight();


        recyclerview_listsourcenews.setLayoutManager(new GridLayoutManager(ListSourceNewsActivity.this, 2));
        initDataSourceNews();
        listSourceNewsAdapter = new ListSourceNewsAdapter(ListSourceNewsActivity.this, arrayListSourceNews);
        listSourceNewsAdapter.setHeight((heightscreen - height_header));
        recyclerview_listsourcenews.setAdapter(listSourceNewsAdapter);
        MyOnClick();
    }

    private void initDataSourceNews() {
        arrayListSourceNews.add(new SourceNews(R.mipmap.logo24h, "24h", SourceData.getDataTab24h()));
        arrayListSourceNews.add(new SourceNews(R.mipmap.logo_express, "Express", SourceData.getDataTabExpress()));


    }


    private void MyOnClick() {
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void Anhxa() {
        layout_header = findViewById(R.id.layout_header);
        imgback = findViewById(R.id.imgback);
        img1 = findViewById(R.id.img1);
        titleheader = findViewById(R.id.titleheader);
        recyclerview_listsourcenews = findViewById(R.id.recyclerview_listsourcenews);
    }
}
