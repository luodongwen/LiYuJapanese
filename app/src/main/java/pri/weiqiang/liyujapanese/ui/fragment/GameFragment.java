package pri.weiqiang.liyujapanese.ui.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import butterknife.BindView;
import pri.weiqaing.common.base.BaseFragment;
import pri.weiqaing.common.rxbus.RxBus;
import pri.weiqaing.common.rxbus.event.EventContainer;
import pri.weiqaing.common.rxbus.event.GameEvent;
import pri.weiqiang.liyujapanese.R;

public class GameFragment extends BaseFragment {

    @BindView(R.id.cv_puzzle)
    CardView mPuzzleCardView;
    @BindView(R.id.cv_supperzzle)
    CardView mSupperzzleCardView;

    @Override
    protected int getViewId() {
        return R.layout.fragment_game;
    }

    @Override
    protected void initVariable(@Nullable Bundle savedInstanceState) {

        mPuzzleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RxBus.getDefault().post(new EventContainer(EventContainer.TYPE_GAME, new GameEvent(GameEvent.TYPE_PUZZLE)));
            }
        });

        mSupperzzleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RxBus.getDefault().post(new EventContainer(EventContainer.TYPE_GAME, new GameEvent(GameEvent.TYPE_SUPPERZZLE)));
            }
        });

    }

    @Override
    protected void doAction() {

    }


}
