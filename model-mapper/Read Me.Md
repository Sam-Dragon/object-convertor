## Steps

# Project
1. Include the following implementation
    implementation 'org.modelmapper:modelmapper:2.3.0'

2. Configure them as bean to be utilized
	@Configuration
	public class ApplicationConfig {
		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
	}

3. Access them where conversion is required
	@Autowired
	private ModelMapper mapper; 

4. Call mapper methods
	mapper.map(ACTUAL_OBJECT, CONVERTED_OBJECT.class);
