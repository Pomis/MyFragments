package pomis.app.myfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    EditText editText;
    Button button;
    TextView textView;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();

        bindViews();
        setListeners();
    }

    private void bindViews() {
        editText = (EditText) getActivity().findViewById(R.id.et_fragment_text);
        button = (Button) getActivity().findViewById(R.id.b_fragment);
        textView = (TextView) getActivity().findViewById(R.id.tv_fragment_text_display);
    }


    private void setListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });
    }
}
