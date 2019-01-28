package pri.weiqiang.liyujapanese.mvp.presenter;

import java.util.List;

import pri.weiqiang.liyujapanese.mvp.bean.GojuonItem;
import pri.weiqiang.liyujapanese.mvp.bean.PixivIllustBean;
import pri.weiqiang.liyujapanese.rxbus.event.EventContainer;

public abstract class BasePresenter<T> {

    public final T view;

    public BasePresenter(T view) {
        this.view = view;
    }

    public interface MainActivityPresenter {
        void initMainActivity();

        void onRadioButtonChanged(int position);

        void onNavigationItemSelected(int id);

        void onBusEventInteraction(EventContainer eventContainer);

        void onMenuItemSelected(int id);

    }

    public interface GojuonTabFragmentPresenter {

        void initGojuonTabFragment();

    }

    public interface GojuonMemoryTabFragmentPresenter {

        void initGojuonMemoryTabFragment();

    }

    public interface WordsFragmentPresenter {

        void initWordsFragment();

        void randomList();

    }

    public interface NewsAPIFragmentPresenter {

        void getNews(String country, String from, String to, String category, String pageSize, String apiKey);

        void getNewsBefore(String country, String from, String to, String category, String pageSize, String apiKey);


    }

    public interface ZhihuFragmentPresenter {

        void initZhihuFragment();

        void getBeforeDaily(String date);

    }

    public interface ArticleDetailActivityPresenter {

        void showContent(int id);

    }

    public interface FavWordsFragmentPresenter {

        void initFavWordsFragment();

        void randomList();

    }

    public interface FavLessonFragmentPresenter {

        void initFavLessonFragment();

    }

    public interface LessonsFragmentPresenter {

        void initLessonsFragment();

    }

    public interface GojuonFragmentPresenter {

        void initGojuonFragment(int category);

    }

    public interface GojuonMemoryFragmentPresenter {

        void initGojuonMemoryFragment(int category);

    }

    public interface TranslateFragmentPresenter {

        void initTranslateFragment();

        void checkFromLanguate(int from);

        void checkToLanguage(int to);

        void checkImageViewClick(int id);

        void doTranslate();

    }

    public interface PixivIllustTabFragmentPresenter {
        void initPixivIllustTabFragment();
    }

    public interface PixivIllustFragmentPresenter {
        void initPixivIllustFragment(String mode);

        void reloadData(String mode);

        void onItemClick(PixivIllustBean bean);
    }

    public interface MemoryFragmentPresenter {

        void initMemoryFragment();

        void loadMore(int category);

        void setDate(int category);

    }

    public interface PuzzleActivityPresenter {

        void initPuzzleActivity();

        void loadData();

        void checkTypeSelect(int which);

        void checkAnswerSelect(int id, GojuonItem current, List<GojuonItem> items);

        void checkMenuSelect(int id);


    }


}