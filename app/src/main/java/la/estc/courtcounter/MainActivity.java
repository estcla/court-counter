package la.estc.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Adds x amount of points to the score for Team A.
     */

    public void addThreeA(View view) {
        score_a += 3;
        displayForTeamA(score_a);
    }

    public void addTwoA(View view) {
        score_a += 2;
        displayForTeamA(score_a);
    }

    public void freeThrowA(View view) {
        score_a += 1;
        displayForTeamA(score_a);
    }


    /**
     * Adds x amount of points to the score for Team B.
     */

    public void addThreeB(View view) {
        score_b += 3;
        displayForTeamB(score_b);
    }

    public void addTwoB(View view) {
        score_b += 2;
        displayForTeamB(score_b);
    }

    public void freeThrowB(View view) {
        score_b += 1;
        displayForTeamB(score_b);
    }
}
