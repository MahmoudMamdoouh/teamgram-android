package org.telegram.ui;



import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

import java.util.ArrayList;

public class MeetsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {

    private LinearLayoutManager layoutManager;
    private EmptyTextProgressView emptyView;

    private int rowCount;
    private int blockUserRow;
    private int blockUserDetailRow;
    private int usersHeaderRow;
    private int usersStartRow;
    private int usersEndRow;
    private int usersDetailRow;

    private boolean blockedUsersActivity;

    private boolean isGroup;
    private ArrayList<Long> uidArray;
    private boolean isAlwaysShare;


    private int currentType;

    public static final int TYPE_PRIVACY = 0;
    public static final int TYPE_BLOCKED = 1;
    public static final int TYPE_FILTER = 2;




    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        if (currentType == TYPE_BLOCKED) {
            NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        if (currentType == TYPE_BLOCKED) {
            NotificationCenter.getInstance(currentAccount).removeObserver(this, NotificationCenter.blockedUsersDidLoad);
        }
    }

    @Override
    public View createView(Context context) {

        fragmentView = new FrameLayout(context);
        FrameLayout frameLayout = (FrameLayout) fragmentView;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));

        emptyView = new EmptyTextProgressView(context);



        if (currentType == TYPE_BLOCKED) {
            emptyView.setText(LocaleController.getString("NoBlocked", R.string.NoBlocked));
        } else {
            emptyView.setText(LocaleController.getString("coming_soon", R.string.NoContacts));
        }
        frameLayout.addView(emptyView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));



        return fragmentView;
    }





    @Override
    public void didReceivedNotification(int id, int account, Object... args) {

    }

    @Override
    public void onResume() {
        super.onResume();

    }

}
