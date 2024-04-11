package Tasca4.Nivel2.Ejercicio1;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

public class MatcherString extends FeatureMatcher<String, Integer> {

    public MatcherString(Matcher<? super Integer> subMatcher) {
        super(subMatcher, "una cadena con longitud", "longitud");
    }
    @Override
    protected Integer featureValueOf(String o) {
        return o.length();
    }

    public static MatcherString hasLenth(Matcher<? super Integer> subMatcher){
        return new MatcherString(subMatcher);
    }
}

