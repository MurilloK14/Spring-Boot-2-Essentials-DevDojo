package academy.devdojo.springboot2.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimePutRequestBody {
    private String name;
    private Long id;
}
