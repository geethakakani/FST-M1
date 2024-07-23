package project;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;

import java.util.HashMap;
import java.util.Map;

@Provider("UserProvider")
@PactFolder("target/pacts")
public class ProviderTest {
@State("POST Request")
    public void state(){}
}
