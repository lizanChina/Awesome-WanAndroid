package json.chao.com.wanandroid.contract.main;

import json.chao.com.wanandroid.base.presenter.AbstractPresenter;
import json.chao.com.wanandroid.base.view.BaseView;

/**
 * @author quchao
 * @date 2017/11/28
 */

public interface MainContract {

    interface View extends BaseView {

        /**
         * Show dismiss error view
         */
        void showDismissErrorView();

        /**
         * Show error view
         */
        void showErrorView();

        /**
         * Show switch project
         */
        void showSwitchProject();

        /**
         * Show switch navigation
         */
        void showSwitchNavigation();
    }

    interface Presenter extends AbstractPresenter<View> {


    }

}
