package com.divianaci.fotobooth.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.divianaci.fotobooth.R;

public class GeneralOptionsFragment extends Fragment {

    private Spinner mTimerDelaySpinner;

    public GeneralOptionsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment GeneralOptions.
     */
    public static GeneralOptionsFragment newInstance() {
        GeneralOptionsFragment fragment = new GeneralOptionsFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mTimerDelaySpinner = (Spinner) getActivity().findViewById(R.id.general_options_timer_delay_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.general_options_timer_delay_options, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mTimerDelaySpinner.setAdapter(adapter);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_general_options, container, false);
    }
}
