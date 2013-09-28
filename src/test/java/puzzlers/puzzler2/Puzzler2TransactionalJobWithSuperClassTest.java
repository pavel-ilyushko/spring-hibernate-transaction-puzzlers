package puzzlers.puzzler2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/puzzler2-context.xml")
public class Puzzler2TransactionalJobWithSuperClassTest {

    @Autowired
    private Puzzler2TransactionalJobWithSuperClass job;

    @Test
    public void voerJobUit() throws InterruptedException {
        job.runJob();
    }
}