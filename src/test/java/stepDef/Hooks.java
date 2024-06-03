package stepDef;

import io.cucumber.java.*;

import static helper.Utility.*;

public class Hooks {
    @Before
    public void beforeTest(){
       openDriver();
    }

    @After
    public void afterTest() throws InterruptedException {
       closeDriver();
    }
}

