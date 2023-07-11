package com.example.lms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
class LmsApplicationTests {

	@Autowired
	private BookStoreRepository bookStoreRepository;
	@Autowired
	private EntityRepository entityRepository;

// 서점 두개를 만들어주세요.

// 서점은 각각 이름과 보유서적으로 구성됩니다.

// 각각 코리아서점, 아이티문고

	@Test
	void t2() {
		BookStore q1 = new BookStore();
		q1.setBookstore("코리아서점");
		this.bookStoreRepository.save(q1);

		BookStore q2 = new BookStore();
		q2.setBookstore("아이티문고");
		this.bookStoreRepository.save(q2);
// 구현 및 테스트

	}



// 모든 서점 정보 조회

// 출력 : 코리아서점, 아이티문고

	@Test
	void t3() {

//		BookStore q1 = this.bookStoreRepository.findByBookstore("코리아서점");
//		BookStore q2 = this.bookStoreRepository.findByBookstore("아이티문고");

		List<BookStore> all = this.bookStoreRepository.findAll();

	for(int i = 0 ; i < all.size() ; i++){
		BookStore q = all.get(i);
		System.out.println(q.getBookstore());}

// 구현 및 테스트

	}





// 아이티문고의 이름을 IT문고로 변경해주세요.

// 변경 후엔 t3() 메서드를 실행해 확인해주세요.

// 출력 : 코리아서점, IT문고

	@Test

	void t4() {

// 구현 및 테스트
		Optional<BookStore> oq = this.bookStoreRepository.findById(2);
		BookStore q = oq.get();
		q.setBookstore("IT문고");
		this.bookStoreRepository.save(q);

	}



// 책 5권을 만들어주세요.

// 책은 제목과 저자, 보유 서점으로 구성됩니다.

// 책은 각각

// 어린왕자, 생떽쥐페리, 코리아서점

// 해리포터, 조앤 롤링, 코리아서점

// 죄와벌, 도스토예프스키, 코리아서점

// 점프 투 스프링부트, 박응용, 아이티문고

// 수학의 정석, 홍성대, 아이티문고

// 로 만들어주세요.



	@Test
	void t5() {

		List<BookStore> all = this.bookStoreRepository.findAll();
		BookStore q = all.get(0);
		BookStore w = all.get(1);

// 구현 및 테스트
		BookEntity b1 = new BookEntity();
		b1.setTitle("어린왕자");
		b1.setAuthor("생떽쥐페리");
		b1.setBookStore(q);
		this.entityRepository.save(b1);

		BookEntity b2 = new BookEntity();
		b2.setTitle("해리포터");
		b2.setAuthor("조앤 롤링");
		b2.setBookStore(q);
		this.entityRepository.save(b2);

		BookEntity b3 = new BookEntity();
		b3.setTitle("죄와벌");
		b3.setAuthor("도스토예프스키");
		b3.setBookStore(q);
		this.entityRepository.save(b3);

		BookEntity b4 = new BookEntity();
		b4.setTitle("스프링부트");
		b4.setAuthor("박응용");
		b4.setBookStore(w);
		this.entityRepository.save(b4);

		BookEntity b5 = new BookEntity();
		b5.setTitle("수학의 정석");
		b5.setAuthor("홍성대");
		b5.setBookStore(w);
		this.entityRepository.save(b5);

	}



// 모든 책의 제목을 출력해주세요.

	@Test

	void t6() {



		List<BookEntity> all = this.entityRepository.findAll();

		for(int i = 0 ; i < all.size() ; i++){
			BookEntity q = all.get(i);
			System.out.println(q.getTitle());}
// 구현 및 테스트

	}



// 코리아서점에서 판매하는 책의 제목을 출력해주세요.

//	@Test

//	void t7() {
//		Optional<BookEntity> oq = this.entityRepository.findById(0);
//		BookEntity s = oq.get();
//		assertEquals("코리아서점", s.getBookStore());
//
//
//		List<BookEntity> all = this.entityRepository.findAll();

//		for (int i = 0; i < all.size(); i++) {
//			if () {
//				BookEntity q = all.get(i);
//				System.out.println(q.getTitle());
//			}
//		}
//	}
// 구현 및 테스트





// 박응용이 쓴 책을 삭제해주세요.

// 삭제 후 t5 메서드를 이용해 확인해주세요.

	@Test
	void t8() {
		BookEntity q = this.entityRepository.findByTitle("박응용");
		this.entityRepository.delete(q);

		}





// 구현 및 테스트


}
