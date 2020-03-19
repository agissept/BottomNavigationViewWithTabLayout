package id.agis.bottomnavigationwithtablayout.completedjob;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.agis.bottomnavigationwithtablayout.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompletedJobFragment extends Fragment {

    public CompletedJobFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_completed_job, container, false);
    }
}
