package main.strokecounter.fragments;

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

import main.strokecounter.holeList.CourseListAdapter;
import main.strokecounter.R;
import main.strokecounter.Storage;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EditCourseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EditCourseFragment extends Fragment {


    private Storage storage;
    private RecyclerView recyclerView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EditCourseFragment() {
        // Required empty public constructor
    }

    public static EditCourseFragment newInstance(String param1, String param2) {
        EditCourseFragment fragment = new EditCourseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_course, container, false);
        //setContentView(R.layout.activity_course_list);
        Button btnSumbitCourse = view.findViewById(R.id.btnSumbitCourse);
        btnSumbitCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setCoursePars(view);
            }
        });
        TextView txtNoCourses = view.findViewById(R.id.txtNoCourses);
        storage = storage.getInstance();
        if(storage.getCourseList().size() == 0){
            recyclerView = view.findViewById(R.id.rvCourseList);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            txtNoCourses.setText("Create a Course First!");
        }else{
            recyclerView = view.findViewById(R.id.rvCourseList);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(new CourseListAdapter(getContext(), storage.getCourseList().get(storage.getCourseList().size() - 1).getHoleList()));

        }
        return view;
    }

    public void onResume(){
        super.onResume();
        TextView txtNoCourses = requireActivity().findViewById(R.id.txtNoCourses);
        if(storage.getCourseList().size() != 0) {
            recyclerView.setAdapter(new CourseListAdapter(getContext(), storage.getCourseList().get(storage.getCourseList().size() - 1).getHoleList()));
            txtNoCourses.setText("");
        }

    }

}