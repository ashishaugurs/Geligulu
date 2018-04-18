package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.geligulu.R;
import com.geligulu.async.RetroClient;
import com.hbb20.CountryCodePicker;
import com.model.Deactivate;
import com.model.ResendEmail;
import com.utils.CommonUtils;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Profile extends Fragment {
     CountryCodePicker ccp;
     View rootView;
     TextView font_fullname,font_uname,font_email,contact_font,font_pwd,cnf_pwd,myProfile;
     Button resend,submit,deactivate;
     EditText full_name,user_name,email_user,phone_user,password,confirm_pwd;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        rootView=inflater.inflate(R.layout.profile, container, false);
        Log.e("fragment","replaced");
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getidS();
        listener();
    }

    private void listener() {

        resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email_user.getText().toString().trim().length() == 0) {
                    email_user.setError("Please enter Email id");
                    email_user.requestFocus();
                } else if (!CommonUtils.isValidEmail(email_user.getText().toString().trim())) {
                    email_user.setError("Please enter valid Email id");
                    email_user.requestFocus();
                }else{
                    if(CommonUtils.isNetworkConnected(getActivity())){
                        resendEmailCall();
                    }else{
                        CommonUtils.simpleSnackBar("Network Error", (LinearLayout) rootView.findViewById(R.id.profile_parent));
                    }
                }

            }
        });

        deactivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDeactivate();
            }
        });
    }

    public void setDeactivate(){

        HashMap<String,Object> alldata=new HashMap<>();
        alldata.put("email",font_email.getText().toString().trim());

        ((RetroClient.getApiService()).getDeactivate(alldata)).enqueue(new Callback<Deactivate>() {
            @Override
            public void onResponse(Call<Deactivate> call, Response<Deactivate> response) {
                System.out.println("Site:===============           " + response.body().getSuccess());
            }
            @Override
            public void onFailure(Call<Deactivate> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void resendEmailCall(){

        HashMap<String,Object> alldata=new HashMap<>();
        alldata.put("email",font_email.getText().toString().trim());

        ((RetroClient.getApiService()).getEmail(alldata)).enqueue(new Callback<ResendEmail>() {
            @Override
            public void onResponse(Call<ResendEmail> call, Response<ResendEmail> response) {
                System.out.println("Site:===============           " + response.body().getSuccess());
            }
            @Override
            public void onFailure(Call<ResendEmail> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void saveUserData(){

        HashMap<String,Object> alldata=new HashMap<>();
        alldata.put("email",font_email.getText().toString().trim());

        ((RetroClient.getApiService()).getEmail(alldata)).enqueue(new Callback<ResendEmail>() {
            @Override
            public void onResponse(Call<ResendEmail> call, Response<ResendEmail> response) {
                System.out.println("Site:===============           " + response.body().getSuccess());
            }
            @Override
            public void onFailure(Call<ResendEmail> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }



    private void getidS() {

        myProfile=rootView.findViewById(R.id.myProfile);
        font_fullname=rootView.findViewById(R.id.font_fullname);
        font_uname=rootView.findViewById(R.id.font_uname);
        font_email=rootView.findViewById(R.id.font_email);
        contact_font=rootView.findViewById(R.id.contact_font);
        font_pwd=rootView.findViewById(R.id.font_pwd);
        cnf_pwd=rootView.findViewById(R.id.cnf_pwd);

        ccp=rootView.findViewById(com.geligulu.R.id.ccp);
        ccp.registerCarrierNumberEditText(phone_user);

        full_name=rootView.findViewById(R.id.full_name);
        user_name=rootView.findViewById(R.id.user_name);
        email_user=rootView.findViewById(R.id.email_user);
        phone_user=rootView.findViewById(R.id.phone_number);
        password=rootView.findViewById(R.id.password);
        confirm_pwd=rootView.findViewById(R.id.confirm_pwd);

        resend=rootView.findViewById(R.id.resend);
        submit=rootView.findViewById(R.id.submit);
        deactivate=rootView.findViewById(R.id.deactivate);




        font_fullname.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        font_uname.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        font_email.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        contact_font.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        font_pwd.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        cnf_pwd.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        full_name.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        user_name.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        email_user.setTypeface(CommonUtils.setFontFTRABK(getActivity()));

        phone_user.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        password.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        confirm_pwd.setTypeface(CommonUtils.setFontFTRABK(getActivity()));
        resend.setTypeface(CommonUtils.setFontTextHeader(getActivity()));
        submit.setTypeface(CommonUtils.setFontTextHeader(getActivity()));
        deactivate.setTypeface(CommonUtils.setFontTextHeader(getActivity()));
        myProfile.setTypeface(CommonUtils.setFontTextHeader(getActivity()));

    }



    private boolean checkValidation() {

        if (full_name.getText().toString().trim().length() == 0) {
            full_name.setError("Please enter Full Name");
            full_name.requestFocus();
            return false;
        }else if (user_name.getText().toString().trim().length() == 0) {
            user_name.setError("Please enter User Name");
            user_name.requestFocus();
            return false;
        }
        else if (email_user.getText().toString().trim().length() == 0) {
            email_user.setError("Please enter Email id");
            email_user.requestFocus();
            return false;
        } else if (!CommonUtils.isValidEmail(email_user.getText().toString().trim())) {
            email_user.setError("Please enter valid Email id");
            email_user.requestFocus();
            return false;
        }
        else if(!ccp.isValidFullNumber()){
            phone_user.setError("Please enter valid mobile number.");
            phone_user.requestFocus();
            return false;
        }
        else if (password.getText().toString().trim().length() == 0) {
            password.setError("Please enter password");
            password.requestFocus();
            return false;
        } else if (password.getText().toString().trim().length() < 8) {
            password.setError("Minimum length of password should be of 8 characters");
            password.requestFocus();
            return false;
        }
        else if (confirm_pwd.getText().toString().trim().length() == 0) {
            confirm_pwd.setError("Please enter password");
            confirm_pwd.requestFocus();
            return false;
        } else if (confirm_pwd.getText().toString().trim().length() < 8) {
            confirm_pwd.setError("Minimum length of password should be of 8 characters");
            confirm_pwd.requestFocus();
            return false;
        }
        else if(password.getText()!=confirm_pwd.getText()){
            confirm_pwd.setError("Password Mismatached");
            confirm_pwd.requestFocus();
            password.setText("");
            confirm_pwd.setText("");
            return false;
        }
        else {
            return true;
        }
    }
}
