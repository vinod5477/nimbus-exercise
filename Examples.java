import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.Execution.Config;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Repo.Database;
import com.antheminc.oss.nimbus.entity.AbstractEntity.IdLong;

import lombok.Getter;
import lombok.Setter;

/**
 * This class created to give sample example on @Config annotation
 * The @Config annotaion performs an action when an button is clicked. In the below example, when the 
 * button is clicked the control will we navigated to speicified url
 *
 */
@Domain(value = "sample_core_nested", includeListeners = { ListenerType.persistence })
@Repo(Database.rep_mongodb)
@Getter
@Setter
public class Examples extends IdLong {

	private static final long serialVersionUID = 1L;

	private String attr_String;
	
	private String testParam;
	
	private String testParam2;
	
	private String testParam3;
	
	/*
	*The @Config annotaion performs an action when an button is clicked. In the below example, when the 
	* button is clicked the control will we navigated to speicified url
	*/
	@Config(url="/testParam3/_update?rawPayload=\"<!../<!../testParam2!>!>\"")
	private String paramConfigWithNestedPath;
	
	@Config(url="/testParam3/_update?rawPayload=\"<!../testParam!><!../testParam2!>\"")
	private String paramConfigWithNestedPath2;
}

