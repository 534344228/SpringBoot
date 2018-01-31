package com.shd.web;

import com.shd.domain.Book;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by 单昊冬
 * 2018/1/31 下午 6:06
 */
@RestController
@RequestMapping("/user")
public class UserController {
	//创建线程安全的Map
	static Map<Integer, Book> books = Collections.synchronizedMap(new HashMap<>());

	@ApiOperation(value = "获取图书列表", notes = "获取所有图书")
	@GetMapping(value = "")
	public List<Book> getBookList() {
		List<Book> r = new ArrayList<>(books.values());
		return r;
	}

	@ApiOperation(value = "创建图书", notes = "创建图书")
	@ApiImplicitParam(name = "book", value = "实体book", required = true, dataType = "Book")
	@PostMapping(value = "")
	public String createBook(Book book) {
		books.put(book.getId(), book);
		return "success";
	}

	@ApiOperation(value = "获取图书", notes = "根据id获取图书")
	@ApiImplicitParam(name = "id", value = "图书Id", required = true, dataType = "Integer")
	@GetMapping(value = "/{id}")
	public Book getBook(@PathVariable Integer id) {
		return books.get(id);
	}
}
