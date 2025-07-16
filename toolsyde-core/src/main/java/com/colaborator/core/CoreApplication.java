package com.colaborator.core;

import com.colaborator.core.model.Category;
import com.colaborator.core.model.Tool;
import com.colaborator.core.repository.CategoryRepository;
import com.colaborator.core.repository.ToolRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadCategories(CategoryRepository categoryRepository, ToolRepository toolRepository) {
		return args -> {

			Category generators = categoryRepository.save(Category.builder()
					.title("Generators")
					.description("Tools that automatically generate content or code.")
					.slug("generators")
					.color("#fca5a5")
					.isNew(true)
					.build());

			Category validators = categoryRepository.save(Category.builder()
					.title("Validators")
					.description("Apps and services to validate data or formats.")
					.slug("validators")
					.color("#6ee7b7")
					.isNew(false)
					.build());

			Category converters = categoryRepository.save(Category.builder()
					.title("Converters")
					.description("Tools to convert formats or data structures.")
					.slug("converters")
					.color("#67e8f9")
					.isNew(true)
					.build());

			Category uiTools = categoryRepository.save(Category.builder()
					.title("UI Tools")
					.description("Utilities to improve UI and design workflows.")
					.slug("ui-tools")
					.color("#c4b5fd")
					.isNew(true)
					.build());

			Category resources = categoryRepository.save(Category.builder()
					.title("Resources")
					.description("A collection of useful resources for developers and designers.")
					.slug("resources")
					.color("#fdba74")
					.isNew(true)
					.build());

			toolRepository.save(Tool.builder()
					.title("Readme Generator")
					.description("Create a markdown file with the information of your project.")
					.slug("readme-generator")
					.uses(0)
					.category(generators)
					.build());

			toolRepository.save(Tool.builder()
					.title("Gitignore Generator")
					.description("Create customizable license keys for software products.")
					.slug("gitignore-generator")
					.uses(0)
					.category(generators)
					.build());

			toolRepository.save(Tool.builder()
					.title("License Picker")
					.description("Create customizable license keys for software products.")
					.slug("license-picker")
					.uses(0)
					.category(generators)
					.build());

			toolRepository.save(Tool.builder()
					.title("QR Code Generator")
					.description("Create customizable QR codes for URLs, text, WiFi, and more.")
					.slug("qr-code")
					.uses(0)
					.category(generators)
					.build());

			toolRepository.save(Tool.builder()
					.title("Mock Data Generator")
					.description("Generate diverse fake data for testing applications.")
					.slug("mock-data-generator")
					.uses(0)
					.category(generators)
					.build());

			toolRepository.save(Tool.builder()
					.title("Regex Tester")
					.description("Test and validate regular expressions with real-time matching.")
					.slug("regex-tester")
					.uses(0)
					.category(validators)
					.build());

			toolRepository.save(Tool.builder()
					.title("Color Picker")
					.description("Select and copy color values easily using an intuitive color wheel or palette.")
					.slug("color-picker")
					.uses(0)
					.category(uiTools)
					.build());

			toolRepository.save(Tool.builder()
					.title("Gradient Generator")
					.description("Create smooth CSS gradients with customizable directions and color stops.")
					.slug("gradient-generator")
					.uses(0)
					.category(uiTools)
					.build());

			toolRepository.save(Tool.builder()
					.title("JSON Formatter")
					.description("Format and validate JSON data for easier readability and debugging.")
					.slug("json-formatter")
					.uses(0)
					.category(resources)
					.build());
		};
	}
}
