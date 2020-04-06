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

package queues_v1

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"fmt"
	"io"

	"github.com/go-openapi/runtime"
	"github.com/go-openapi/strfmt"

	"github.com/polyaxon/polyaxon/sdks/go/http_client/v1/service_model"
)

// QueuesV1GetQueueReader is a Reader for the QueuesV1GetQueue structure.
type QueuesV1GetQueueReader struct {
	formats strfmt.Registry
}

// ReadResponse reads a server response into the received o.
func (o *QueuesV1GetQueueReader) ReadResponse(response runtime.ClientResponse, consumer runtime.Consumer) (interface{}, error) {
	switch response.Code() {
	case 200:
		result := NewQueuesV1GetQueueOK()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return result, nil
	case 204:
		result := NewQueuesV1GetQueueNoContent()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return result, nil
	case 403:
		result := NewQueuesV1GetQueueForbidden()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	case 404:
		result := NewQueuesV1GetQueueNotFound()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	default:
		result := NewQueuesV1GetQueueDefault(response.Code())
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		if response.Code()/100 == 2 {
			return result, nil
		}
		return nil, result
	}
}

// NewQueuesV1GetQueueOK creates a QueuesV1GetQueueOK with default headers values
func NewQueuesV1GetQueueOK() *QueuesV1GetQueueOK {
	return &QueuesV1GetQueueOK{}
}

/*QueuesV1GetQueueOK handles this case with default header values.

A successful response.
*/
type QueuesV1GetQueueOK struct {
	Payload *service_model.V1Queue
}

func (o *QueuesV1GetQueueOK) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/{agent}/queues/{uuid}][%d] queuesV1GetQueueOK  %+v", 200, o.Payload)
}

func (o *QueuesV1GetQueueOK) GetPayload() *service_model.V1Queue {
	return o.Payload
}

func (o *QueuesV1GetQueueOK) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(service_model.V1Queue)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewQueuesV1GetQueueNoContent creates a QueuesV1GetQueueNoContent with default headers values
func NewQueuesV1GetQueueNoContent() *QueuesV1GetQueueNoContent {
	return &QueuesV1GetQueueNoContent{}
}

/*QueuesV1GetQueueNoContent handles this case with default header values.

No content.
*/
type QueuesV1GetQueueNoContent struct {
	Payload interface{}
}

func (o *QueuesV1GetQueueNoContent) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/{agent}/queues/{uuid}][%d] queuesV1GetQueueNoContent  %+v", 204, o.Payload)
}

func (o *QueuesV1GetQueueNoContent) GetPayload() interface{} {
	return o.Payload
}

func (o *QueuesV1GetQueueNoContent) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	// response payload
	if err := consumer.Consume(response.Body(), &o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewQueuesV1GetQueueForbidden creates a QueuesV1GetQueueForbidden with default headers values
func NewQueuesV1GetQueueForbidden() *QueuesV1GetQueueForbidden {
	return &QueuesV1GetQueueForbidden{}
}

/*QueuesV1GetQueueForbidden handles this case with default header values.

You don't have permission to access the resource.
*/
type QueuesV1GetQueueForbidden struct {
	Payload interface{}
}

func (o *QueuesV1GetQueueForbidden) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/{agent}/queues/{uuid}][%d] queuesV1GetQueueForbidden  %+v", 403, o.Payload)
}

func (o *QueuesV1GetQueueForbidden) GetPayload() interface{} {
	return o.Payload
}

func (o *QueuesV1GetQueueForbidden) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	// response payload
	if err := consumer.Consume(response.Body(), &o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewQueuesV1GetQueueNotFound creates a QueuesV1GetQueueNotFound with default headers values
func NewQueuesV1GetQueueNotFound() *QueuesV1GetQueueNotFound {
	return &QueuesV1GetQueueNotFound{}
}

/*QueuesV1GetQueueNotFound handles this case with default header values.

Resource does not exist.
*/
type QueuesV1GetQueueNotFound struct {
	Payload interface{}
}

func (o *QueuesV1GetQueueNotFound) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/{agent}/queues/{uuid}][%d] queuesV1GetQueueNotFound  %+v", 404, o.Payload)
}

func (o *QueuesV1GetQueueNotFound) GetPayload() interface{} {
	return o.Payload
}

func (o *QueuesV1GetQueueNotFound) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	// response payload
	if err := consumer.Consume(response.Body(), &o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewQueuesV1GetQueueDefault creates a QueuesV1GetQueueDefault with default headers values
func NewQueuesV1GetQueueDefault(code int) *QueuesV1GetQueueDefault {
	return &QueuesV1GetQueueDefault{
		_statusCode: code,
	}
}

/*QueuesV1GetQueueDefault handles this case with default header values.

An unexpected error response
*/
type QueuesV1GetQueueDefault struct {
	_statusCode int

	Payload *service_model.RuntimeError
}

// Code gets the status code for the queues v1 get queue default response
func (o *QueuesV1GetQueueDefault) Code() int {
	return o._statusCode
}

func (o *QueuesV1GetQueueDefault) Error() string {
	return fmt.Sprintf("[GET /api/v1/orgs/{owner}/agents/{agent}/queues/{uuid}][%d] QueuesV1_GetQueue default  %+v", o._statusCode, o.Payload)
}

func (o *QueuesV1GetQueueDefault) GetPayload() *service_model.RuntimeError {
	return o.Payload
}

func (o *QueuesV1GetQueueDefault) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(service_model.RuntimeError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}