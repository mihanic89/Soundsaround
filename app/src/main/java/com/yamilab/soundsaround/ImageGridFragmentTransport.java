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
public class ImageGridFragmentTransport extends Fragment {


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
        mDataset.add(new Object(getString(R.string.car),R.mipmap.transport_hd_1,R.raw.transport0));
        mDataset.add(new Object(getString(R.string.truck),R.mipmap.transport_hd_2,R.raw.transport1));
        mDataset.add(new Object(getString(R.string.bus),R.mipmap.transport_hd_3,R.raw.transport2));
        mDataset.add(new Object(getString(R.string.tram),R.mipmap.transport_hd_4,R.raw.transport3));
        mDataset.add(new Object(getString(R.string.trolley),R.mipmap.transport_hd_5,R.raw.transport4));
        mDataset.add(new Object(getString(R.string.plane),R.mipmap.transport_hd_6,R.raw.transport5));
        mDataset.add(new Object(getString(R.string.helicopter),R.mipmap.transport_hd_7,R.raw.transport6));
        mDataset.add(new Object(getString(R.string.train),R.mipmap.transport_hd_8,R.raw.transport7));
        mDataset.add(new Object(getString(R.string.eltrain),R.mipmap.transport_hd_9,R.raw.transport8));
        mDataset.add(new Object(getString(R.string.metro),R.mipmap.transport_hd_10,R.raw.transport9));
        mDataset.add(new Object(getString(R.string.police),R.mipmap.transport_hd_11,R.raw.transport10));
        mDataset.add(new Object(getString(R.string.ambulance),R.mipmap.transport_hd_12,R.raw.transport11));
        mDataset.add(new Object(getString(R.string.firetruck),R.mipmap.transport_hd_13,R.raw.transport12));
        mDataset.add(new Object(getString(R.string.marine),R.mipmap.transport_hd_14,R.raw.transport13));
        mDataset.add(new Object(getString(R.string.motorcycle),R.mipmap.transport_hd_15,R.raw.transport14));
        mDataset.add(new Object(getString(R.string.bike),R.mipmap.transport_hd_16,R.raw.transport15));
        mDataset.add(new Object(getString(R.string.cart),R.mipmap.transport_hd_17,R.raw.transport16));
        mDataset.add(new Object(getString(R.string.shuttle),R.mipmap.transport_hd_18,R.raw.transport17));
       }
}
