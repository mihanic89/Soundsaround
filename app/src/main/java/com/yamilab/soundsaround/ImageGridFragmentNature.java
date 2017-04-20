package com.yamilab.soundsaround;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import static com.yamilab.soundsaround.R.id.recyclerView;


/**
 * Created by Misha on 28.03.2017.
 */
public class ImageGridFragmentNature extends Fragment {


    private static final String TAG = "RecyclerViewFragment";
    private static final String KEY_LAYOUT_MANAGER = "layoutManager";
    private static final int SPAN_COUNT = 2;
    private static final int DATASET_COUNT = 40;

    private enum LayoutManagerType {
        GRID_LAYOUT_MANAGER,
        LINEAR_LAYOUT_MANAGER
    }
    protected LayoutManagerType mCurrentLayoutManagerType;

    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected ArrayList<Object> mDataset;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize dataset, this data would usually come from a local content provider or
        // remote server.
        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // BEGIN_INCLUDE(initializeRecyclerView)
        mRecyclerView = (RecyclerView) rootView.findViewById(recyclerView);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(gaggeredGridLayoutManager);


        mAdapter = new CustomAdapter(mDataset);
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // END_INCLUDE(initializeRecyclerView)



        return rootView;
    }


    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    private void initDataset() {
        mDataset = new ArrayList<>();
        Object data = new Object();
        mDataset.add(new Object(getString(R.string.summer),     R.mipmap.nature_hd_1,R.raw.nature0));
        mDataset.add(new Object(getString(R.string.autumn),     R.mipmap.nature_hd_2,R.raw.nature1));
        mDataset.add(new Object(getString(R.string.winter),     R.mipmap.nature_hd_3,R.raw.nature2));
        mDataset.add(new Object(getString(R.string.spring),     R.mipmap.nature_hd_4,R.raw.nature3));
        mDataset.add(new Object(getString(R.string.rain),       R.mipmap.nature_hd_5,R.raw.nature4));
        mDataset.add(new Object(getString(R.string.lightning),  R.mipmap.nature_hd_6,R.raw.nature5));
        mDataset.add(new Object(getString(R.string.hurricane),  R.mipmap.nature_hd_7,R.raw.nature6));
        mDataset.add(new Object(getString(R.string.forest),     R.mipmap.nature_hd_8,R.raw.nature7));
        mDataset.add(new Object(getString(R.string.ocean),      R.mipmap.nature_hd_9,R.raw.nature8));
        mDataset.add(new Object(getString(R.string.desert),     R.mipmap.nature_hd_10,R.raw.nature9));
        mDataset.add(new Object(getString(R.string.mount),      R.mipmap.nature_hd_11,R.raw.nature10));
        mDataset.add(new Object(getString(R.string.waterfall),  R.mipmap.nature_hd_12,R.raw.nature11));
        mDataset.add(new Object(getString(R.string.river),      R.mipmap.nature_hd_13,R.raw.nature12));
        mDataset.add(new Object(getString(R.string.volcano),    R.mipmap.nature_hd_14,R.raw.nature13));
        mDataset.add(new Object(getString(R.string.glacier),    R.mipmap.nature_hd_15,R.raw.nature14));

       }
}
