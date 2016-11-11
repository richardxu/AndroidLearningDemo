package richard.example.com.androidlearningdemo.fragment.DialogFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import richard.example.com.androidlearningdemo.R;

/**
 * Created by Administrator on 2016/11/11.
 */

public class EditNameDialogFragment extends DialogFragment implements TextView.OnEditorActionListener {

    private EditText mEditText;

    //1,Define the listener interface with a method passing back data result.
    public interface EditNameDialogListener{
        void onFinishEditDialog(String inputText);
    }

    public EditNameDialogFragment(){
        //Empty constructor is required for DialogFragment
        //Make sure not to add arguments to the constructor
        // use 'newInstance' instead as shown below
    }

    public static EditNameDialogFragment newInstance(String title)
    {
        EditNameDialogFragment frag = new EditNameDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_edit_name,container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        //Get field from view
        mEditText = (EditText) view.findViewById(R.id.txt_your_name);
        // Fetch arguments from bundle and set title
        String title = getArguments().getString("title");
        //Show soft keyboard automatically and request focus to field
        mEditText.requestFocus();
        getDialog().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE
        );

        //2. Setup a callback when the "Done" button is pressed on keyboard
        mEditText.setOnEditorActionListener(this);
    }

    // Fires whenever the textfield has an action preformed
    // In this case, when the "Done" button is pressed
    // REQUIRES a 'soft keyboard' (virtual keyboard)
    @Override
    public boolean onEditorAction(TextView textView, int actionID, KeyEvent keyEvent) {
        if(EditorInfo.IME_ACTION_DONE == actionID){
            //Return input text back to acitivity through the implemnted Listener
            EditNameDialogListener listener = (EditNameDialogListener) getActivity();
            listener.onFinishEditDialog(mEditText.getText().toString());
            //Close the dialog and return back to the parent activity
            dismiss();
            return true;
        }
        return false;
    }
}
