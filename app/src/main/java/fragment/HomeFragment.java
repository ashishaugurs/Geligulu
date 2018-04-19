package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.geligulu.R;
import com.utils.AppConstant;
import com.utils.CommonUtils;


public class HomeFragment extends Fragment {

    View view;
    TextView user_dummy,tv_dishname, tv_description;
    ImageView iv_image;
    String str_name, str_disname, str_des, str_imagename;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        init();
        return view;
    }

    private void init() {

        str_name = getArguments().getString("name");
        str_disname = getArguments().getString("dish");
        str_des = getArguments().getString("des");
        str_imagename = getArguments().getString("image");
//        str_imagename = "chinese";
        tv_dishname = (TextView) view.findViewById(R.id.tv_dishname);
        user_dummy = (TextView) view.findViewById(R.id.user_dummy);
        tv_description = (TextView) view.findViewById(R.id.tv_description);
        tv_dishname.setText(str_disname);
        tv_description.setText(str_des);
        user_dummy.setText(CommonUtils.getPreferencesString(getActivity(), AppConstant.FULL_NAME));
    }

}
