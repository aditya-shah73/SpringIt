package com.reddit.springit;

import com.reddit.springit.domain.Comment;
import com.reddit.springit.domain.Link;
import com.reddit.springit.repository.CommentRepository;
import com.reddit.springit.repository.LinkRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	PrettyTime prettyTime(){
		return new PrettyTime();
	}

//	//@Bean
//	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
//		return args -> {
//			Link link = new Link("Getting Started with spring boot 2", "https://shah-aditya73.github.io");
//			linkRepository.save(link);
//
//			Comment comment = new Comment("This spring boot 2 link is awesome", link );
//			commentRepository.save(comment);
//			link.addComment(comment);
//
//			System.out.println("We just inserted a link and a comment");
//			System.out.println("===========================================================");
//
////			Link firstLink = linkRepository.findByTitle("Getting Started with spring boot 2");
////			System.out.println(firstLink.getTitle());
//		};
//	}

}
