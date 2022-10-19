package personal.projects;

import android.provider.BaseColumns;

public final class QuizContract {

    private QuizContract() {} // Make sure we cannot create an instance of this class
                              // The class is supposed to be only a container

    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";

    }
}
