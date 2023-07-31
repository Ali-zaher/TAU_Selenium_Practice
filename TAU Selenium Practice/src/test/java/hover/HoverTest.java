package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);
        //assertTrue(caption.isCaptionDisplayyed(),"Caption not displayyed");
        assertEquals(caption.getTitle(),"name: user1", "caption title is invalid");
        assertEquals(caption.getLinkText(),"View profile","link is invalid");
        assertTrue(caption.getLink().endsWith("/users/1"),"link incorrect");
    }
}
