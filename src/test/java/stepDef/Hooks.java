package stepDef;

import io.cucumber.java.*;

import java.util.Objects;

import static helper.Utility.*;

public class Hooks {
    String tagRuning = null;

    @BeforeAll
    public static void setUp(){ System.out.println("Before All");
    }

    @AfterAll
    public static void tearDown(){ System.out.println("After All");
    }

    @Before
    public void beforeTest(Scenario sc){
        System.out.println("Before Test");
        String[] tags = sc.getSourceTagNames().toArray(new String[0]);
        tagRuning = tags[0];
        if (Objects.equals(tagRuning, "@web")) {
            openDriver();
        }
    }

    @After
    public void afterTest(Scenario sc) throws InterruptedException {
        System.out.println("After Test");
        if (Objects.equals(tagRuning, "@web")) {
            closeDriver();
        }
    }
}

