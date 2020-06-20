package TestLoginFrame;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestingCredentials.class, TestingEncryptedFct.class, TestingUser.class })
public class AllTests_User {

}
