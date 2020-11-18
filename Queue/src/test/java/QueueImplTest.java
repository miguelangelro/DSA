import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class QueueImplTest {
     Queue<String> q;

    @Before
    public void setUp() throws Exception{
        this.q= new QueueImpl<String>(5);
        this.q.push("1");
        this.q.push("2");
        this.q.push("3");
    }

    @After
    public void tearDown(){
        this.q=null;
    }

    @Test
    public void testPush1() throws Exception{ // hace testing sobre la opcion de encuar (push)
        Assert.assertEquals(3,this.q.size());
        this.q.push("4");
        Assert.assertEquals(4,this.q.size());
    }

    @Test
    public void testPush2() throws Exception{
        Assert.assertEquals(3,this.q.size());
        this.q.push("4");
        this.q.push("5");
        Assert.assertEquals(5,this.q.size());
    }

    @Test(expected = FullQueueException.class) // Esperamos que la cola reviente
    public void testPushFull() throws Exception{
        Assert.assertEquals(3,this.q.size());
        this.q.push("4");
        this.q.push("5");
        this.q.push("6");
        Assert.assertEquals(5,this.q.size());
    }

    @Test(expected = EmptyQueueException.class) // esperamos cola vacia
    public void testPopEmpty() throws Exception{
        Assert.assertEquals(3,this.q.size());
        String e= this.q.pop();
        Assert.assertEquals(2,this.q.size());
        Assert.assertEquals("1",e);

        e= this.q.pop();
        Assert.assertEquals(1,this.q.size());
        Assert.assertEquals("2",e);

        e= this.q.pop();
        Assert.assertEquals(0,this.q.size());
        Assert.assertEquals("3",e);

        e= this.q.pop();
    }


}
