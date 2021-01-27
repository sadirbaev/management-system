package uz.sadirbaev.managementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VariableRequestBody {
    private String line;
    private String machine;
    private String product;
}
