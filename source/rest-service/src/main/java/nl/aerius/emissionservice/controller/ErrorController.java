/*
 * Copyright the State of the Netherlands
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package nl.aerius.emissionservice.controller;

import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller to ensure errors get handled properly.
 * Without this, errors won't be properly picked up because the DatasetsResource will be inspected for an /error mapping, which isn't there.
 */
@Controller
@RequestMapping("${openapi.aERIUSEmissionService.base-path:/api/v1}")
public class ErrorController extends BasicErrorController {

  public ErrorController(final ErrorAttributes errorAttributes, final ServerProperties serverProperties) {
    super(errorAttributes, serverProperties.getError());
  }

  @Override
  @GetMapping(value = "/error", produces = {"application/json"})
  public ResponseEntity<Map<String, Object>> error(final HttpServletRequest request) {
    return super.error(request);
  }

}
