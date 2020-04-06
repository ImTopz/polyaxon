// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Code generated by go-swagger; DO NOT EDIT.

package agents_v1

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"fmt"
	"io"

	"github.com/go-openapi/runtime"
	"github.com/go-openapi/strfmt"

	"github.com/polyaxon/polyaxon/sdks/go/http_client/v1/service_model"
)

// AgentsV1ListAgentNamesReader is a Reader for the AgentsV1ListAgentNames structure.
type AgentsV1ListAgentNamesReader struct {
	formats strfmt.Registry
}

// ReadResponse reads a server response into the received o.
func (o *AgentsV1ListAgentNamesReader) ReadResponse(response runtime.ClientResponse, consumer runtime.Consumer) (interface{}, error) {
	switch response.Code() {
	case 200:
		result := NewAgentsV1ListAgentNamesOK()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return result, nil
	case 204:
		result := NewAgentsV1ListAgentNamesNoContent()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return result, nil
	case 403:
		result := NewAgentsV1ListAgentNamesForbidden()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	case 404:
		result := NewAgentsV1ListAgentNamesNotFound()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	default:
		result := NewAgentsV1ListAgentNamesDefault(response.Code())
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		if response.Code()/100 == 2 {
			return result, nil
		}
		return nil, result
	}
}

// NewAgentsV1ListAgentNamesOK creates a AgentsV1ListAgentNamesOK with default headers values
func NewAgentsV1ListAgentNamesOK() *AgentsV1ListAgentNamesOK {
	return &AgentsV1ListAgentNamesOK{}
}

/*AgentsV1ListAgentNamesOK handles this case with default header values.

A successful response.
*/
type AgentsV1ListAgentNamesOK struct {
	Payload *service_model.V1ListAgentsResponse
}

func (o *AgentsV1ListAgentNamesOK) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/names][%d] agentsV1ListAgentNamesOK  %+v", 200, o.Payload)
}

func (o *AgentsV1ListAgentNamesOK) GetPayload() *service_model.V1ListAgentsResponse {
	return o.Payload
}

func (o *AgentsV1ListAgentNamesOK) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(service_model.V1ListAgentsResponse)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewAgentsV1ListAgentNamesNoContent creates a AgentsV1ListAgentNamesNoContent with default headers values
func NewAgentsV1ListAgentNamesNoContent() *AgentsV1ListAgentNamesNoContent {
	return &AgentsV1ListAgentNamesNoContent{}
}

/*AgentsV1ListAgentNamesNoContent handles this case with default header values.

No content.
*/
type AgentsV1ListAgentNamesNoContent struct {
	Payload interface{}
}

func (o *AgentsV1ListAgentNamesNoContent) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/names][%d] agentsV1ListAgentNamesNoContent  %+v", 204, o.Payload)
}

func (o *AgentsV1ListAgentNamesNoContent) GetPayload() interface{} {
	return o.Payload
}

func (o *AgentsV1ListAgentNamesNoContent) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	// response payload
	if err := consumer.Consume(response.Body(), &o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewAgentsV1ListAgentNamesForbidden creates a AgentsV1ListAgentNamesForbidden with default headers values
func NewAgentsV1ListAgentNamesForbidden() *AgentsV1ListAgentNamesForbidden {
	return &AgentsV1ListAgentNamesForbidden{}
}

/*AgentsV1ListAgentNamesForbidden handles this case with default header values.

You don't have permission to access the resource.
*/
type AgentsV1ListAgentNamesForbidden struct {
	Payload interface{}
}

func (o *AgentsV1ListAgentNamesForbidden) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/names][%d] agentsV1ListAgentNamesForbidden  %+v", 403, o.Payload)
}

func (o *AgentsV1ListAgentNamesForbidden) GetPayload() interface{} {
	return o.Payload
}

func (o *AgentsV1ListAgentNamesForbidden) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	// response payload
	if err := consumer.Consume(response.Body(), &o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewAgentsV1ListAgentNamesNotFound creates a AgentsV1ListAgentNamesNotFound with default headers values
func NewAgentsV1ListAgentNamesNotFound() *AgentsV1ListAgentNamesNotFound {
	return &AgentsV1ListAgentNamesNotFound{}
}

/*AgentsV1ListAgentNamesNotFound handles this case with default header values.

Resource does not exist.
*/
type AgentsV1ListAgentNamesNotFound struct {
	Payload interface{}
}

func (o *AgentsV1ListAgentNamesNotFound) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/names][%d] agentsV1ListAgentNamesNotFound  %+v", 404, o.Payload)
}

func (o *AgentsV1ListAgentNamesNotFound) GetPayload() interface{} {
	return o.Payload
}

func (o *AgentsV1ListAgentNamesNotFound) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	// response payload
	if err := consumer.Consume(response.Body(), &o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewAgentsV1ListAgentNamesDefault creates a AgentsV1ListAgentNamesDefault with default headers values
func NewAgentsV1ListAgentNamesDefault(code int) *AgentsV1ListAgentNamesDefault {
	return &AgentsV1ListAgentNamesDefault{
		_statusCode: code,
	}
}

/*AgentsV1ListAgentNamesDefault handles this case with default header values.

An unexpected error response
*/
type AgentsV1ListAgentNamesDefault struct {
	_statusCode int

	Payload *service_model.RuntimeError
}

// Code gets the status code for the agents v1 list agent names default response
func (o *AgentsV1ListAgentNamesDefault) Code() int {
	return o._statusCode
}

func (o *AgentsV1ListAgentNamesDefault) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/names][%d] AgentsV1_ListAgentNames default  %+v", o._statusCode, o.Payload)
}

func (o *AgentsV1ListAgentNamesDefault) GetPayload() *service_model.RuntimeError {
	return o.Payload
}

func (o *AgentsV1ListAgentNamesDefault) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(service_model.RuntimeError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}