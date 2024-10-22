package main.strokecounter.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import main.strokecounter.courseStrokeCounting.CourseStrokeActivity;
import main.strokecounter.courseStrokeCounting.CourseStrokeCountListAdapter;
import main.strokecounter.holeList.CourseListAdapter;
import main.strokecounter.R;
import main.strokecounter.Storage;


public class EditCourseFragment extends Fragment {


    private Storage storage;
    private RecyclerView recyclerView;




    public EditCourseFragment() {
        // Required empty public constructor
    }

    public static EditCourseFragment newInstance(String param1, String param2) {
        EditCourseFragment fragment = new EditCourseFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_course, container, false);
        storage = storage.getInstance();
        TextView txtNoCourses = view.findViewById(R.id.txtNoCourses);
        if(storage.getCourseList().size() == 0){
            recyclerView = view.findViewById(R.id.rvCourseList);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            txtNoCourses.setText("Create a Course First!");
        }else {
            recyclerView = view.findViewById(R.id.rvCourseList);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(new CourseListAdapter(getContext(), storage.getCourseList()));
        }
        return view;
    }

    public void onResume(){
        super.onResume();
        TextView txtNoCourses = requireActivity().findViewById(R.id.txtNoCourses);
        recyclerView.setAdapter(new CourseListAdapter(getContext(), storage.getCourseList()));
        if(storage.getCourseList().size() == 0){
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            txtNoCourses.setText("Create a Course First!");
        }else {
            recyclerView.setAdapter(new CourseListAdapter(getContext(), storage.getCourseList()));
            txtNoCourses.setText("");
        }

    }
}