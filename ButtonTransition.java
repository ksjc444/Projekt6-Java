package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.text.MessageFormat;

public class ButtonTransition {

    private static final Double SPEED = 200.d;
    private static final String TRANSLATION_DISTANCE_TIME_SPEED_MSG = "Translation distance: {0}, time: {1}, speed: {2}";

    private TranslateTransition transition;

    ButtonTransition(Button button) {
        transition = new TranslateTransition();
        transition.setNode(button);
    }

    void play(Double xTransition, Double yTransition, Double distance) {
        double time = distance/SPEED;
        System.out.println(MessageFormat.format(TRANSLATION_DISTANCE_TIME_SPEED_MSG, distance, time, distance/time));
        transition.setToX(xTransition);
        transition.setToY(yTransition);
        transition.setDuration(Duration.seconds(time));
        transition.play();
    }
}
