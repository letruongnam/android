package com.uni.officecriminal;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.uni.officecriminal.event.CriminalItemClickEvent;
import com.uni.officecriminal.model.Criminal;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 * A simple {@link Fragment} subclass.
 */
public class CriminalDetailFragment extends Fragment {

    private TextView textviewTitle;
    private ImageView imageDetail;
    private TextView Warning;

    public CriminalDetailFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new CriminalDetailFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        EventBus.getDefault().register(this);
        View v = inflater.inflate(R.layout.fragment_criminal_detail, container, false);
        textviewTitle = v.findViewById(R.id.TextDetail);
        imageDetail = v.findViewById(R.id.ImageDetail);
        Warning = v.findViewById(R.id.Warning);
        return  v;
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(CriminalItemClickEvent event){
        Criminal criminal = event.getCriminal();
        textviewTitle.setText(criminal.getDescriptiom());
        switch (criminal.getImagePath()){
                case ("mocua"):
                imageDetail.setImageResource(R.drawable.mocua);
                break;
                case ("hai"):
                imageDetail.setImageResource(R.drawable.hai);
                break;
                case ("ba"):
                imageDetail.setImageResource(R.drawable.ba);
                break;
                case ("bon"):
                imageDetail.setImageResource(R.drawable.bon);
                break;
                case ("nam"):
                imageDetail.setImageResource(R.drawable.nam);
                break;
                case ("sau"):
                imageDetail.setImageResource(R.drawable.sau);
                break;

        }

            if (criminal.getSolved()){
                Warning.setText("This criminal has been solved");
                Warning.setBackgroundColor(Color.BLUE);
            }

            else{
                Warning.setText("This criminal has not solve yet");
                Warning.setBackgroundColor(Color.RED);
            }



       // imageDetail.setImageResource(R.drawable.);
    };
}
