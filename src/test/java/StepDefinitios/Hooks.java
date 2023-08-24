package StepDefinitios;

import Utulities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Baslangic Islemleri");
    }

    @After
    public void after()
    {
        System.out.println("Bitis Islemleri");
        GWD.quitDriver();
    }


}
