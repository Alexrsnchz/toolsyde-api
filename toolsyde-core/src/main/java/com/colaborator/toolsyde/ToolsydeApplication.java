package com.colaborator.toolsyde;

import com.colaborator.toolsyde.model.Category;
import com.colaborator.toolsyde.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToolsydeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToolsydeApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadCategories(CategoryRepository repository) {
		return args -> {

			repository.save(Category.builder()
					.title("Generators")
					.description("Tools that automatically generate content or code.")
					.slug("generator")
					.color("#fca5a5")
					.isNew(true)
					.build());

			repository.save(Category.builder()
					.title("Validators")
					.description("Apps and services to validate data or formats.")
					.slug("validators")
					.color("#6ee7b7")
					.isNew(false)
					.build());

			repository.save(Category.builder()
					.title("Converters")
					.description("Tools to convert formats or data structures.")
					.slug("converters")
					.color("#67e8f9")
					.isNew(true)
					.build());

			repository.save(Category.builder()
					.title("UI Tools")
					.description("Utilities to improve UI and design workflows.")
					.slug("ui-tools")
					.color("#c4b5fd")
					.isNew(true)
					.build());

			repository.save(Category.builder()
					.title("Resources")
					.description("A collection of useful resources for developers and designers.")
					.slug("resources")
					.color("#fdba74")
					.isNew(true)
					.build());
		};
	}
}
