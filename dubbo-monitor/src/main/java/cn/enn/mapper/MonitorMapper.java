package cn.enn.mapper;

import java.util.List;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.url.component.ServiceConfigURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

@Repository
public class MonitorMapper {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<URL> findAll() {
		return mongoTemplate.findAll(URL.class);
	}

	public URL findById(Integer id) {
		return mongoTemplate.findById(id, URL.class);
	}

	public List<URL> find(Query query) {
		return mongoTemplate.find(query, URL.class);
	}

	public long upsert(Query query, Update update){
		 UpdateResult upsert = mongoTemplate.upsert(query, update, URL.class);
		 return upsert.getModifiedCount();
	}

	public long remove(Query query) {
		DeleteResult remove = mongoTemplate.remove(query, URL.class);
		return remove.getDeletedCount();
	}

	public URL insert(URL bean) {
		return mongoTemplate.insert(bean);
	}
}
