package org.rxjava.service.goods.client;

import org.rxjava.service.goods.form.CategoryListForm;
import org.rxjava.service.goods.model.CategoryModel;
import org.rxjava.service.goods.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.validation.Valid;

/**
 * @author happy 2019-03-25 23:12
 */
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("categories")
    public Flux<CategoryModel> getList(
        @Valid CategoryListForm form
    ) {
        return categoryService
                .getList(form);
    }
}
