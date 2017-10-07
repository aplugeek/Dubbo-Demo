

import com.aplugeek.dto.Notice;
import com.aplugeek.service.NoticeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

 
/**
 * 测试 action
 * @author admin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-applicationContext.xml"})
public class Test3 {

	 @Autowired
	 NoticeService noticeService;
	 
	@Test
	public void getModelTest() { 
		Notice notice = noticeService.getNotice();
	}

}
