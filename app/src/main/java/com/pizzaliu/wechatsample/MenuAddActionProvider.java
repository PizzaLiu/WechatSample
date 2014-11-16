package com.pizzaliu.wechatsample;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.support.v4.view.ActionProvider;

/**
 * Created by Pizza on 2014/10/31.
 */
public class MenuAddActionProvider extends ActionProvider {
    public MenuAddActionProvider(Context context) {
        super(context);
    }

    @Override
    public View onCreateActionView() {
        return null;
    }

    @Override
    public boolean hasSubMenu() {
        return true;
    }

    @Override
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        subMenu.add(R.string.action_group_chat).setIcon(R.drawable.ic_menu_group_chat).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        subMenu.add(R.string.action_add_friend).setIcon(R.drawable.ic_menu_add_friend).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        subMenu.add(R.string.action_video_chat).setIcon(R.drawable.ic_menu_video_chat).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        subMenu.add(R.string.action_scan_qr).setIcon(R.drawable.ic_menu_scan_qr).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

        subMenu.add(R.string.action_snap_share).setIcon(R.drawable.ic_menu_camera).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });


        super.onPrepareSubMenu(subMenu);
    }
}
