package cn.enn.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import cn.enn.bean.User;

@Repository
public class ProvideMapper {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<User> findAll() {
		 List<User> findAll = mongoTemplate.findAll(User.class);
		 return findAll;
	}

	public User findById(Integer id) {
		return mongoTemplate.findById(id, User.class);
	}

	public List<User> find(Query query) {
		return mongoTemplate.find(query, User.class);
	}

	public long upsert(Query query, Update update){
		 UpdateResult upsert = mongoTemplate.upsert(query, update, User.class);
		 return upsert.getModifiedCount();
	}

	public long remove(Query query) {
		DeleteResult remove = mongoTemplate.remove(query, User.class);
		return remove.getDeletedCount();
	}

	public User insert(User user) {
		return mongoTemplate.insert(user);
	}

}
